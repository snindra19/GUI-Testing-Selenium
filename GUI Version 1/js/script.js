let userName = localStorage.getItem('userName') || "";
let bonusScore = parseInt(localStorage.getItem('bonusScore') || "0");

window.onload = function() {
  if (document.getElementById('thankText') && userName) {
    document.getElementById('thankText').textContent = `Thanks, ${userName}!`;
  }
  
  if (document.getElementById('scoreDisplay') && localStorage.getItem('totalScore')) {
    document.getElementById('scoreDisplay').textContent = localStorage.getItem('totalScore');
  }
  loadSavedAnswers();
};

function loadSavedAnswers() {
  const radioGroups = ['q1', 'q2', 'q3', 'q4', 'q5', 'experience', 'rating'];
  
  radioGroups.forEach(name => {
    const savedValue = localStorage.getItem(name);
    if (savedValue) {
      const radio = document.querySelector(`input[name="${name}"][value="${savedValue}"]`);
      if (radio) radio.checked = true;
    }
  });
  
  const textInputs = ['username', 'bonus2', 'bonus3', 'bonus4', 'feedback'];
  
  textInputs.forEach(id => {
    const savedValue = localStorage.getItem(id);
    const input = document.getElementById(id);
    if (input && savedValue) input.value = savedValue;
  });
  
  const checkboxes = ['honorCheckbox', 'subscribe'];
  
  checkboxes.forEach(id => {
    const savedValue = localStorage.getItem(id);
    const checkbox = document.getElementById(id);
    if (checkbox && savedValue === 'true') checkbox.checked = true;
  });
  
  const sliders = ['slider1', 'slider2', 'slider3', 'slider4', 'slider5'];
  
  sliders.forEach(id => {
    const savedValue = localStorage.getItem(id);
    const slider = document.getElementById(id);
    if (slider && savedValue) slider.value = savedValue;
  });
}

function nextPage(pageId) {
  if (pageId === 'page2') {
    const nameInput = document.getElementById('username').value.trim();
    const experienceSelected = document.querySelector('input[name="experience"]:checked');
    const honorChecked = document.getElementById('honorCheckbox').checked;

    if (nameInput === "") {
      alert("Please enter your name!");
      return;
    }
    if (!experienceSelected) {
      alert("Please select your experience level.");
      return;
    }
    if (!honorChecked) {
      alert("Please confirm that you are taking the quiz without external help.");
      return;
    }

    localStorage.setItem('userName', nameInput);
    localStorage.setItem('bonusScore', '0');
    localStorage.setItem('username', nameInput);
    localStorage.setItem('honorCheckbox', honorChecked);
    localStorage.setItem('experience', experienceSelected.value);
    
    userName = nameInput;
    bonusScore = 0;
  }

  if (pageId === 'page6') {
    processAnswers();
  }
  window.location.href = pageId + '.html';
}

function processAnswers() {
  const q1 = localStorage.getItem('q1');
  const q2 = localStorage.getItem('q2');
  const q3 = localStorage.getItem('q3');
  const q4 = localStorage.getItem('q4');
  const q5 = localStorage.getItem('q5');
  
  checkBonusAnswer("bonus2", "eiffeltower");
  checkBonusAnswer("bonus3", "mapleleaf");
  checkBonusAnswer("bonus4", "nollywood");
  
  let score = 0;
  if (q1 === 'Paris') score++;
  if (q2 === 'Rome') score++;
  if (q3 === 'Ottawa') score++;
  if (q4 === 'Canberra') score++;
  if (q5 === 'Abuja') score++;

  const totalScore = score + bonusScore;
  localStorage.setItem('bonusScore', bonusScore.toString());
  localStorage.setItem('totalScore', totalScore.toString());
}

function checkBonusAnswer(inputId, correctAnswer) {
  const userAnswer = localStorage.getItem(inputId) || "";
  if (userAnswer.toLowerCase().replace(/\s+/g, "") === correctAnswer) {
    bonusScore += 1;
  }
}

function saveAnswer(name, value) {
  localStorage.setItem(name, value);
}

function saveSliderValue(id) {
  const slider = document.getElementById(id);
  if (slider) {
    localStorage.setItem(id, slider.value);
  }
}

function saveRadioAnswer(name) {
  const selected = document.querySelector(`input[name="${name}"]:checked`);
  if (selected) {
    localStorage.setItem(name, selected.value);
  }
}

function saveBonusAnswer(inputId) {
  const bonusInput = document.getElementById(inputId);
  if (bonusInput) {
    localStorage.setItem(inputId, bonusInput.value);
  }
}

function saveCheckbox(id) {
  const checkbox = document.getElementById(id);
  if (checkbox) {
    localStorage.setItem(id, checkbox.checked);
  }
}

function confirmAndNext(checkboxId, nextPageId) {
  const confirmBox = document.getElementById(checkboxId);
  if (!confirmBox.checked) {
    alert("Please confirm before proceeding.");
    return;
  }
  
  const page = checkboxId.replace('confirm', '');
  
  if (page === '2') {
    saveRadioAnswer('q1');
    saveRadioAnswer('q2');
    saveBonusAnswer('bonus2');
    saveSliderValue('slider1');
    saveSliderValue('slider2');
  } else if (page === '3') {
    saveRadioAnswer('q3');
    saveRadioAnswer('q4');
    saveBonusAnswer('bonus3');
    saveSliderValue('slider3');
    saveSliderValue('slider4');
  } else if (page === '4') {
    saveRadioAnswer('q5');
    saveBonusAnswer('bonus4');
    saveSliderValue('slider5');
  }
  
  saveCheckbox(checkboxId);
  nextPage(nextPageId);
}

function goBack(pageId) {
  if (pageId === 'page1') {
    localStorage.clear();
  }
  window.location.href = pageId + '.html';
}

function submitFeedback() {
  const feedback = document.getElementById('feedback').value.trim();
  const subscribed = document.getElementById('subscribe').checked;
  const rating = document.querySelector('input[name="rating"]:checked')?.value;

  localStorage.setItem('feedback', feedback);
  localStorage.setItem('subscribe', subscribed);
  if (rating) localStorage.setItem('rating', rating);

  console.log("User:", userName);
  console.log("Rating:", rating);
  console.log("Feedback:", feedback);
  console.log("Subscribed:", subscribed);
  alert("Thank you for your feedback!");
}
let userName = localStorage.getItem('userName') || "";
let bonusScore = parseInt(localStorage.getItem('bonusScore') || "0");

window.onload = function() {
  if (document.getElementById('thankText') && userName) {
    document.getElementById('thankText').textContent = `Thanks, ${userName}!`;
  }

  if (document.getElementById('scoreDisplay') && localStorage.getItem('totalScore')) {
    document.getElementById('scoreDisplay').textContent = localStorage.getItem('totalScore');
  }
};

function nextPage(pageId) {
  if (pageId === 'page3') {
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
  
  const bonus2 = localStorage.getItem('bonus2') || '';
  const bonus3 = localStorage.getItem('bonus3') || '';
  const bonus4 = localStorage.getItem('bonus4') || '';
  
  if (bonus2.toLowerCase().replace(/\s+/g, "") === "eiffeltower") bonusScore++;
  if (bonus3.toLowerCase().replace(/\s+/g, "") === "mapleleaf") bonusScore++;
  if (bonus4.toLowerCase().replace(/\s+/g, "") === "nollywood") bonusScore++;
  
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

function saveAnswer(name, value) {
  localStorage.setItem(name, value);
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
  } else if (page === '3') {
    saveRadioAnswer('q3');
    saveRadioAnswer('q4');
    saveBonusAnswer('bonus3');
  } else if (page === '4') {
    saveRadioAnswer('q5');
    saveBonusAnswer('bonus4');
  }
  
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

  console.log("User:", userName);
  console.log("Rating:", rating);
  console.log("Feedback:", feedback);
  console.log("Subscribed:", subscribed);
  alert("Thank you for your feedback!");
}
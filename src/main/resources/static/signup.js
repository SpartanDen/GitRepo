document.getElementById("signupBtn").addEventListener("click", function () {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    const role = document.querySelector(".role.selected").innerText.toLowerCase();
  
    fetch("/signup", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({ username, password, role })
    })
    .then(response => {
      if (response.ok) {
        alert("Signup successful!");
        window.location.href = "/index.html";
      } else {
        alert("Signup failed!");
      }
    });
  });
  window.onload = () => {
    const savedType = localStorage.getItem('animalType');
    if (savedType) {
      const radio = document.querySelector(`input[value="${savedType}"]`);
      if (radio) radio.checked = true;
    }
  };
  window.location.href = "home.html";
  function selectRole(button) {
    document.querySelectorAll('.role').forEach(btn => btn.classList.remove('selected'));
    button.classList.add('selected');
  }
  
  
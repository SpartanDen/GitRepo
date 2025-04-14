document.getElementById('reportBtn').addEventListener('click', async () => {
    const type = document.querySelector('input[name="animalType"]:checked')?.value;
    const location = document.getElementById('location').value;
    const state = document.getElementById('state').value;
    const description = document.getElementById('description').value;
    const reporterUsername = localStorage.getItem('username') || "guest";
    
    if (!type || !location || !state) {
        alert("Please fill in all required fields.");
        return;
    }

    const reportData = {
        type,
        location,
        state,
        description,
        reporterUsername
    };

    try {
        const response = await fetch("http://localhost:8080/api/animals/report", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(reportData)
        });

        if (response.ok) {
            alert("Animal report submitted! ✅");
            window.location.href = "home.html";
        } else {
            alert("Failed to report animal.");
        }
    } catch (err) {
        console.error("Error:", err);
        alert("An error occurred while submitting the report.");
    }
});

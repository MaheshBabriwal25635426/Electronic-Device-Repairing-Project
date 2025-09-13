

// // Handle form submission
// document.getElementById("feedbackForm").addEventListener("submit", function(event) {
//     event.preventDefault();  // Prevent form submission to server

//     // Get form values
//     const name = document.getElementById("name").value;
//     const email = document.getElementById("email").value;
//     const feedback = document.getElementById("feedback").value;

//     // Create a new feedback display element
//     const feedbackDisplay = document.createElement("div");
//     feedbackDisplay.classList.add("feedback-display");
//     feedbackDisplay.innerHTML = `
//         <p><strong>Name:</strong> ${name}</p>
//         <p><strong>Email:</strong> ${email}</p>
//         <p><strong>Feedback:</strong> ${feedback}</p>
//     `;

//     // Append the feedback to the comments section
//     document.getElementById("commentsSection").appendChild(feedbackDisplay);

//     // Show the feedback display
//     feedbackDisplay.style.display = "block";

//     // Clear the form fields after submission
//     document.getElementById("feedbackForm").reset();
// });
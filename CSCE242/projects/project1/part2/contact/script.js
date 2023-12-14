document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('contactForm');
    const responseMessage = document.getElementById('responseMessage');

    form.addEventListener('submit', async function(event) {
        event.preventDefault();

        // Simulating email sending functionality
        try {
            // In a real scenario, you would send a request to your server or email API
            // Example: await fetch('/send-email', { method: 'POST', body: new FormData(form) });

            // Displaying a success message
            responseMessage.style.display = 'block';
            responseMessage.style.backgroundColor = '#d4edda';
            responseMessage.textContent = 'Your message has been sent successfully!';
        } catch (error) {
            // Displaying an error message
            responseMessage.style.display = 'block';
            responseMessage.style.backgroundColor = '#f8d7da';
            responseMessage.textContent = 'Error sending message. Please try again.';
        }
    });
});
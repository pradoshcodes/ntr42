document.addEventListener('DOMContentLoaded', () => {
    const imageInput = document.getElementById('imageInput');
    const output = document.getElementById('output');

    imageInput.addEventListener('change', handleFileSelect);

    function handleFileSelect(event) {
        const file = event.target.files[0];

        if (file) {
            const reader = new FileReader();

            reader.onload = function(e) {
                const base64String = e.target.result;
                output.textContent = base64String;
                console.log('Base64 String:', base64String);
            };

            reader.readAsDataURL(file);
        } else {
            output.textContent = 'No file selected';
        }
    }
});

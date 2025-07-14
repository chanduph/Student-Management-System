// Theme Toggle Functionality
document.addEventListener('DOMContentLoaded', function() {
    const themeToggle = document.getElementById('theme-toggle');

    // Check for saved theme preference or use preferred color scheme
    const savedTheme = localStorage.getItem('theme') ||
                      (window.matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light');
    setTheme(savedTheme);

    // Toggle theme on button click
    if (themeToggle) {
        themeToggle.addEventListener('click', function() {
            const currentTheme = document.body.classList.contains('dark-mode') ? 'light' : 'dark';
            setTheme(currentTheme);
        });
    }

    // Set the theme
    function setTheme(theme) {
        document.body.classList.toggle('dark-mode', theme === 'dark');
        localStorage.setItem('theme', theme);

        // Update icon
        const icon = document.querySelector('#theme-toggle i');
        if (icon) {
            icon.className = theme === 'dark' ? 'fas fa-sun' : 'fas fa-moon';
        }
    }
});

// Student search functionality (existing code)
document.getElementById('usn-form')?.addEventListener('submit', function (e) {
    e.preventDefault();
    const usn = document.getElementById('usn').value.trim().toUpperCase();

    fetch(`http://localhost:8080/api/student/${usn}`)
        .then(response => {
            if (!response.ok) throw new Error("Not found");
            return response.json();
        })
        .then(student => {
            document.getElementById('student-info').classList.remove('d-none');
            document.getElementById('student-name').textContent = student.name;
            document.getElementById('student-usn').textContent = student.usn;
            document.getElementById('dob').textContent = student.dob;
            document.getElementById('gender').textContent = student.gender;
            document.getElementById('category').textContent = student.category;
            document.getElementById('mobile').textContent = student.mobile;
            document.getElementById('email').textContent = student.email;
            document.getElementById('current-address').textContent = student.currentAddress;
            document.getElementById('permanent-address').textContent = student.permanentAddress;

            document.getElementById('score10').textContent = student.score10;
            document.getElementById('scorePu').textContent = student.scorePu;
            document.getElementById('scoreBe').textContent = student.scoreBe;
            document.getElementById('cet-rank').textContent = student.cetRank;
            document.getElementById('backlogs').textContent = student.backlogs;

            document.getElementById('cgpa1').textContent = student.cgpaSem1;
            document.getElementById('cgpa2').textContent = student.cgpaSem2;
            document.getElementById('cgpa3').textContent = student.cgpaSem3;
            document.getElementById('cgpa4').textContent = student.cgpaSem4;
            document.getElementById('cgpa5').textContent = student.cgpaSem5;
            document.getElementById('cgpa6').textContent = student.cgpaSem6;

            const avg = (
                student.cgpaSem1 +
                student.cgpaSem2 +
                student.cgpaSem3 +
                student.cgpaSem4 +
                student.cgpaSem5 +
                student.cgpaSem6
            ) / 6;
            document.getElementById('avg-cgpa').textContent = avg.toFixed(2);

            document.getElementById('pu-college').textContent = student.puCollegeName;
            document.getElementById('sslc-school').textContent = student.sslcSchoolName;
            document.getElementById('yop10').textContent = student.yop10th;
            document.getElementById('yop12').textContent = student.yop12th;
        })
        .catch(() => {
            alert("Student not found. Please check the USN and try again.");
        });
});
// Obtener elementos del DOM
const loginBtn = document.getElementById('login-btn');
const signupBtn = document.getElementById('signup-btn');
const loginModal = document.getElementById('login-modal');
const signupModal = document.getElementById('signup-modal');
const closeLogin = document.getElementById('close-login');
const closeSignup = document.getElementById('close-signup');

// Función para abrir el modal de inicio de sesión
loginBtn.addEventListener('click', () => {
    loginModal.style.display = 'block';
});

// Función para abrir el modal de registro
signupBtn.addEventListener('click', () => {
    signupModal.style.display = 'block';
});

// Función para cerrar el modal de inicio de sesión
closeLogin.addEventListener('click', () => {
    loginModal.style.display = 'none';
});

// Función para cerrar el modal de registro
closeSignup.addEventListener('click', () => {
    signupModal.style.display = 'none';
});

// Cerrar modales al hacer clic fuera del contenido
window.addEventListener('click', (event) => {
    if (event.target == loginModal) {
        loginModal.style.display = 'none';
    }
    if (event.target == signupModal) {
        signupModal.style.display = 'none';
    }
});

// Manejar el envío del formulario de registro (Simulación)
const signupForm = document.getElementById('signup-form');
signupForm.addEventListener('submit', (e) => {
    e.preventDefault();
    alert('Registro exitoso (simulado).');
    signupModal.style.display = 'none';
});

// Manejar el envío del formulario de inicio de sesión (Simulación)
const loginForm = document.getElementById('login-form');
loginForm.addEventListener('submit', (e) => {
    e.preventDefault();
    alert('Inicio de sesión exitoso (simulado).');
    loginModal.style.display = 'none';
});

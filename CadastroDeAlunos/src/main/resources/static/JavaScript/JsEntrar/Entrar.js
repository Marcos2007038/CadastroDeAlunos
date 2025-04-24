// Espera o HTML carregar
document.addEventListener("DOMContentLoaded", () => {
    const senhaInput = document.getElementById("Senha");
    const checkbox = document.getElementById("checkbox");
    const erroDiv = document.getElementById("Erro");
    const botaoEntrar = document.querySelector('button[type="submit"]');
  
    // Mostrar/ocultar senha ao marcar o checkbox
    checkbox.addEventListener("change", () => {
      senhaInput.type = checkbox.checked ? "text" : "password";
    });
  
    // Mostrar erro ao clicar no botão (usando onclick)
    botaoEntrar.addEventListener("click", (event) => {
      event.preventDefault(); // impede o envio do formulário
      erroDiv.style.display = "flex"; // exibe a div de erro
  
      // Oculta automaticamente depois de 3 segundos (opcional)
      setTimeout(() => {
        erroDiv.style.display = "none";
      }, 5000);
    });
  });
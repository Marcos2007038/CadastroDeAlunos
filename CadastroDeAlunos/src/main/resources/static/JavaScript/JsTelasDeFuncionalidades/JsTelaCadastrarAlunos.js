/** Função para pegar a data atual **/
const hoje = new Date().toISOString().split('T')[0]; // Formato: YYYY-MM-DD
document.getElementById('DataNascimento').value = hoje;


function EnviarDados(){

        // Captura os dados
        const nome = document.getElementById('NomeCompleto').value;
        const email = document.getElementById('Email').value;
        const telefone = document.getElementById('Telefone').value;
        const cpf = document.getElementById('CPF').value;
        const sexo = document.getElementById('sexo').value;
        const dataNascimento = document.getElementById('DataNascimento').value;

        // Cria um objeto com os dados
        const dados = {
            nomeCompleto: nome,
            email: email,
            telefone: telefone,
            cpf: cpf,
            sexo: sexo,
            dataNascimento: dataNascimento
        };
		/** Aqui vai ficar o comando para enviar para se coectar com a API(java)**/
	
};


/** Função de ir para a pagina TelaHome **/
function IrParaTelaHome(){
    window.location.assign("http://localhost:8080/TelaHome");

}
// Criando a transição entre as div do login e registrar da tela 
const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const body = document.getElementById('body');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});

// Função para mostrar todos os pop-ups dos campos obrigatórios do form
function validar() {
	var nome = formCadastro.nome.value;
	var email = formCadastro.email.value;
	var cpf = formCadastro.cpf.value;
	var telefone = formCadastro.telefone.value;
	var senha = formCadastro.senha.value;
	var rep_senha = formCadastro.rep_senha.value;
	var pergunta = formCadastro.pergunta.value;
	var resposta = formCadastro.resposta.value;

	if (nome == "") {
		alert("Preencha o campo Nome.");
		formCadastro.nome.focus();
		return false;
	}
	if (email == "" || email.indexOf('@') == -1) {
		alert("Preencha o campo E-mail.");
		formCadastro.email.focus();
		return false;
	}
	if (cpf == "") {
		alert("Preencha o campo CPF." || cpf.length < 14);
		formCadastro.cpf.focus();
		return false;
	}
	if (telefone == "") {
		alert("Preencha o campo Telefone." || telefone.length < 15);
		formCadastro.telefone.focus();
		return false;
	}
	if (senha == "" || senha.length <= 5) {
		alert("A senha deve ter o mínimo de 6 caracteres");
		formCadastro.senha.focus();
		return false;
	}
	if (senha != rep_senha) {
		alert("As senhas não coincidem");
		formCadastro.rep_senha.focus();
		return false;
	}
	if (pergunta == "") {
		alert("Preencha o campo Pergunta.");
		formCadastro.pergunta.focus();
		return false;
	}
	if (resposta == "") {
		alert("Preencha o campo Resposta.");
		formCadastro.resposta.focus();
		return false;
	}
}
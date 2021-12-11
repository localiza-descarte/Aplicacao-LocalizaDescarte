//Função para exibir o pop-up de obrigatoriedade dos campos do form
function validar() {
	var email = formRedefinir.email.value;
	var cpf = formRedefinir.cpf.value;

	if (email == "" || email.indexOf('@') == -1) {
		alert("Preencha o campo E-mail.");
		formRedefinir.email.focus();
		return false;
	}
	if (cpf == "") {
		alert("Preencha o campo CPF." || cpf.length < 14);
		formRedefinir.cpf.focus();
		return false;
	}
}
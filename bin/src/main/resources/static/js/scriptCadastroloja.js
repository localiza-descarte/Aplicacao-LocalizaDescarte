//logica de validação 
function validar() {

	// Cada var, corresponde aos input do form 
	var nome = formCadastroLoja.nome.value;
	var email = formCadastroLoja.email.value;
	var cnpj = formCadastroLoja.cnpj.value;
	var telefone = formCadastroLoja.telefone.value;
	var senha = formCadastroLoja.senha.value;
	var rep_senha = formCadastroLoja.rep_senha.value;
	var cep = formEndereco.cep.value;
	var cidade = formEndereco.cidade.value;
	var estado = formEndereco.estado.value;
	var bairro = formEndereco.bairro.value;
	var rua = formEndereco.rua.value;
	var numero = formEndereco.numero.value;

	//Condições para exibir as mensagens de obrigatoriedade nos campos do form
	if (nome == "") {
		alert("Preencha o campo Nome");
		formCadastroLoja.nome.focus();
		return false;
	}
	if (email == "") {
		alert("Preencha o campo E-mail");
		formCadastroLoja.email.focus();
		return false;
	}
	if (cnpj == "") {
		alert("Preencha o campo CNPJ.");
		formCadastroLoja.cnpj.focus();
		return false;
	}
	if (telefone == "") {
		alert("Preencha o campo Telefone.");
		formCadastroLoja.telefone.focus();
		return false;
	}
	if (senha == "" || senha.length <= 5) {
		alert("A senha deve ter o mínimo de 6 caracteres");
		formCadastroLoja.senha.focus();
		return false;
	}
	if (senha != rep_senha) {
		alert("Senhas Diferentes");
		formCadastro.rep_senha.focus();
		return false;
	}
	if (cep == "") {
		alert("Preencha o campo CEP.")
		formEndereco.cep.focus();
		return false;
	}
	if (estado == "") {
		alert("Preencha o campo Estado.")
		formEndereco.estado.focus();
		return false;
	}
	
	if( estado !== "AC" ){
        alert("Estado inválido.")
        formEndereco.estado.focus();
        return false;
    }

	if (cidade == "") {
		alert("Preencha a Cidade.")
		formEndereco.cidade.focus();
		return false;
	}
	if (bairro == "") {
		alert("Preencha o campo Bairro.")
		formEndereco.bairro.focus();
		return false;
	}
	if (rua == "") {
		alert("Preencha o campo Rua.")
		formEndereco.rua.focus();
		return false;
	}
	if (numero == "") {
		alert("Preencha o campo Número.")
		formEndereco.numero.focus();
		return false;
	}
}

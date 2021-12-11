//Mascaras para autocomplementação de caracteres especiais do cnpj, telefone e cep.

// Exibir as separação do telefone
function mascara_telefone() {
	var numero = document.getElementById("telefone")
	if (telefone.value.length == 0) {
		numero.value += "("
	} else if (numero.value.length == 3) {
		numero.value += ")"
	}
	else if (cpf.value.length == 5) {
		numero.value += " "
	}
	else if (numero.value.length == 10) {
		numero.value += "-"
	}
}

// Exibir as separação do cep
function mascara_cep() {
	var cep = document.getElementById("cep")
	if (cep.value.length == 5) {
		cep.value += "-"
	}
}
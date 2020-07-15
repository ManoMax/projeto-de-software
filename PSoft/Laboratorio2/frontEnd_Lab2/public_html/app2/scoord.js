exports.disciplina= disciplina;

function disciplina(_id, _nome, _creditos, _pre_requisitos) {
	let id = _id;
	let nome = _nome;
	let creditos = _creditos;
	let pre_requisitos = _pre_requisitos;
	return {
		creditos: creditos,
		pre_requisitos: pre_requisitos,
		id: () => id,
		get_nome: () => nome,
		get_creditos: () => creditos,
		get_professor: () => professor,
		set_nome: (_nome) => nome = _nome
	}
}

function turma(_disciplina_ref, _periodo) {
	let disciplina_ref = _disciplina_ref;
	let periodo = _periodo;
	let estudantes = [];
	let professor = null;
	return {
		set_professor: (_professor) => professor = _professor,
		add_estudante: (_estudante) => estudantes.push(_estudante)
	}
}

let t1 = disciplina('Psoft', 'Projeto de Software', 4, []);
console.log(t1.get_nome());
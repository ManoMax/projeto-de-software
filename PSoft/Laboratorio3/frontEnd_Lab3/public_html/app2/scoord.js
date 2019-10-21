exports.disciplina= disciplina;

function disciplina(_id, _nome, _creditos, _pre_requisitos) {
	let id = _id;
	let nome = _nome;
	let creditos = _creditos;
	let professor = null;
	let pre_requisitos = _pre_requisitos;
	return {
		creditos: creditos,
		pre_requisitos: pre_requisitos,
		id: () => id,
		get_nome: () => nome,
		get_creditos: () => creditos,
		get_professor: () => professor,
		set_nome: (_nome) => nome = _nome,
		set_professor: (_professor) => professor = _professor
	}
}

let t1 = disciplina('Psoft', 'Projeto de Software', 4, []);
console.log(t1.get_nome());
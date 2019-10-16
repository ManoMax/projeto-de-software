function create_turma(id, nome, periodo, estudantes) {
	let _id = id;
	let _nome = nome;
	let _periodo = periodo;
	let _professor = null;
	let _estudantes = estudantes;
	return {
		getId: () => _id,
		getNome: () => _nome,
		getPeriodo: () => _periodo,
		getProfessor: () => _professor,
		getEstudantes: () => _estudantes,
		setEstudante: function (estudante) {
			_estudantes.forEach((element, index) => {
				if (estudante.getMatricula() == element.getMatricula()) {
					return null;
				};
			});
			_estudantes.push(estudante);
		},
		setProfessor: (professor) => _professor = professor
	}
}

let t1 = create_turma('Psoft', 'Projeto de Software', 4, []);
console.log(t1.getNome());
console.log(t1.getEstudantes());
t1.setEstudante(
	{matricula: '123',
	nome: 'Malucao',
	getMatricula: () => this.matricula});
console.log(t1.getEstudantes());
t1.setEstudante(
	{matricula: '123',
	nome: 'Outro Maluco',
	getMatricula: () => this.matricula});
console.log(t1.getEstudantes());
t1.setEstudante(
	{matricula: '124',
	nome: 'Esse vai',
	getMatricula: () => this.matricula});
console.log(t1.getEstudantes());


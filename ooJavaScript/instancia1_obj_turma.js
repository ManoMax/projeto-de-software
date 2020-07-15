function create_turma(disciplina, vagas) {
  // Instancia e retorna o objeto dentro da funcao
  let turma = {};

  turma.nome = disciplina;
  turma.limite_de_vagas = vagas;
  turma.matriculados = [];

  turma.matricule = function (aluno) {
  // this == turma
    if (this.matriculados.length < this.limite_de_vagas) {
      this.matriculados.push(aluno);
        return true;
      }
      return false;
  }

  turma.alunos = function () {
    return turma.matriculados;
  }

  turma.vagas = function () {
    return (this.limite_de_vagas - this.matriculados.length);
  }

  return turma;
}

function create_turma2(disciplina, vagas) {
    return {
        nome: disciplina,
        limite_de_vagas: vagas,
        matriculados: [],
        matricule: function (aluno) {
            if (this.matriculados.length < this.limite_de_vagas) {
                this.matriculados.push(aluno);
                return true;
            }
            return false;
        },
        alunos: function () { return this.matriculados},
        vagas: function () { return (this.limite_de_vagas - this.matriculados.length)}
    }
}

// creat_turma
let psoft = create_turma('psoft', 4);
console.log(psoft.vagas());
console.log(psoft.matricule('Luiggy'));
console.log(psoft.vagas());

console.log(psoft.matricule('Euclides'));
console.log(psoft.matricule('Caio'));
console.log(psoft.matricule('Max'));
console.log(psoft.vagas());

console.log(psoft.matricule('Não pode entrar'));
console.log(psoft.alunos());
console.log(psoft.vagas());

// creat_turma2
let disciplina2 = create_turma2('New Disciplina', 3);
console.log(disciplina2.vagas());
console.log(disciplina2.matricule('Luiggy'));
console.log(disciplina2.vagas());

console.log(disciplina2.matricule('Euclides'));
console.log(disciplina2.matricule('Caio'));
console.log(disciplina2.matricule('Max'));
console.log(disciplina2.vagas());

console.log(disciplina2.matricule('Não pode entrar'));
console.log(disciplina2.alunos());
console.log(disciplina2.vagas());
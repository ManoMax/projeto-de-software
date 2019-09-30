function create_turma(disciplina, vagas) {
    let turma = {};
  
    turma.nome = disciplina;
    turma.limite_de_vagas = vagas;
    turma.matriculados = [];
  
    turma.matricule = function (aluno) {
      if (turma.matriculados.length < turma.limite_de_vagas) {
        turma.matriculados.push(aluno);
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
  
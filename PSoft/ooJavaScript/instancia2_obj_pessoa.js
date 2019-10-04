function create_pessoa(nome) {
    let pessoa = {};
    pessoa.nome = nome;
    pessoa.fale = function () { return "oi, eu sou " + pessoa.nome };
    return pessoa;
}

function create_pessoa2(nome) {
    return {
        nome: nome,
        fale: function () { return "oi, eu sou " + nome }
    };
}
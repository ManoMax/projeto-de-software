let proto_pessoa = {
    fale: function () {
        return "oi";
    }
};
function create_pessoa(nome) {
    let pessoa = Object.create(proto_pessoa);
    pessoa.nome = nome;
    return pessoa;
}
let p1 = create_pessoa();
let p2 = create_pessoa();
let p3 = create_pessoa();
console.log(p1.fale == p2.fale);
console.log(p1.fale == p3.fale);
console.log(p2.fale == p3.fale);
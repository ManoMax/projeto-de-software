function Pessoa(nome) {
    this.nome = nome;
    return this;
}
Pessoa.prototype.fale = function () {
    return "oi, eu sou " + this.nome;
};
let p1 = new Pessoa('fulano');
let p2 = new Pessoa('beltrano');
let p3 = new Pessoa('sicrano');
console.log(p1.fale());
console.log(p2.fale());
console.log(p3.fale());
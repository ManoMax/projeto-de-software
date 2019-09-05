// IIFE -> Immediately Invoked Function Expression

// Envolvendo a Função Anônima com ()
(function() {
    // window.a = `...` // Deliberadamente usando escopo Global
    console.log('Será executado na hora!')
    console.log('Foge do escopo mais abrangente!')
})() // Esse () final chama a função
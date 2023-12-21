// let tituloPag = document.getElementById('tituloPag')



function load(){
    let nome = document.getElementById("nome")
    let nasc = document.getElementById("dataNasc")
    let mae = document.getElementById("nomeMae")
    let internamento = document.getElementById("internamento")
    let sexo = document.getElementById("sexo")
    let alergia = document.getElementById("alergia")
    let municipio = document.getElementById("municipio")
// _______________________________________________________________
    let array = []
    array = localStorage.getItem("valores")
    let valores = JSON.parse(array)
    
    nome.innerText = valores.Nome
    nasc.innerText = valores.Nasc
    mae.innerText = valores.Mae
    internamento.innerText = valores.Internamento
    sexo.innerText = valores.Sexo
    alergia.innerText = valores.Alergia
    municipio.innerText = valores.Municipio
    
    document.title = valores.Nome
    
    self.focus();
    window.print();
}
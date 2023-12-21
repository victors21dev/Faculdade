let nome = document.getElementById('formNome')
let dtNasc = document.getElementById('formDataNasc')
let Sexo = document.getElementById('formSexo')
let Alergia = document.getElementById('formAlergia')
let NomeMae = document.getElementById('formNomeMae')
let Internamento = document.getElementById('formInternamento')
let Municipio = document.getElementById('formMunicipio')
// ___________________________________________________________
let etNome = document.getElementById('etNome')
let etData = document.getElementById('etData')
let etMae = document.getElementById('etMae')
let etInternamento = document.getElementById('etInternamento')
let etSexo = document.getElementById('etSexo')
let etAlergia = document.getElementById('etAlergia')
let etMunicipio = document.getElementById('etMunicipio')
// ___________________________________________________________


let checkbox = document.getElementById('checkbox')

// Submit sem atualizar
const form = document.getElementById('some-form')

form.addEventListener('submit', e => {
    e.preventDefault()
})

// Gerador de Etiquetas.
function gerarEtiqueta(){
        
    if((nome.value == "") || (dtNasc.value == "") || (Sexo.value == "") || (Alergia.value == "") ||
    (NomeMae.value == "") || (Internamento.value == "") || (Municipio.value == "")
    ){
        if(checkbox.getAttribute('valorcheck')=='0'){
        }else{
            abrirTela()
            gerandoDados()
        }
    }
    else{
        abrirTela()
        gerandoDados()
    }   
}

function gerandoDados(){
    let dataDeNascimento
    if(dtNasc.value == ""){
        dataDeNascimento = dtNasc.value
    }else{
        let dataInv = []
        dataInv = dtNasc.value
        
        dataDeNascimento = dataInv[8]+dataInv[9]+'/'+dataInv[5]+dataInv[6]+'/'+dataInv[0]+dataInv[1]+dataInv[2]+dataInv[3] 
    }

    
    let valores = []
    valores = ({'Nome': nome.value, 
    'Nasc': dataDeNascimento, 
    'Sexo': Sexo.value, 
    'Alergia': Alergia.value,
    'Municipio': Municipio.value,
    'Mae': NomeMae.value ,
    'Internamento': Internamento.value})
    
    etNome.innerText = valores.Nome
    etData.innerText = valores.Nasc
    etSexo.innerText = valores.Sexo
    etAlergia.innerText = valores.Alergia
    etMunicipio.innerText = valores.Municipio
    etMae.innerText = valores.Mae
    etInternamento.innerText = valores.Internamento
    
    localStorage.setItem("valores",JSON.stringify(valores))  
}

function abrirTela(){
    telaImpressaoEt.style.display = 'flex'
}

function imprimirEtiqueta(){
    
}
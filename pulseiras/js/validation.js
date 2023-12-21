// Validação bootstrap campos preenchidos
(() => {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    const forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.from(forms).forEach(form => {
      form.addEventListener('submit', event => {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }

        form.classList.add('was-validated')
      }, false)
    })
  })()
// _________________________________________________________
// variáveis
const QUERYINPUT = document.querySelectorAll('input')
const QUERYSELECT = document.querySelectorAll('select')

// adiciona o valor ao atributo
function validar(string){
    checkbox.setAttribute('valorCheck', `${string}`)
}
// função que remove o required
function removerAttr(query, value){
    query[value].removeAttribute('required')
}
// função que adiciona o required
function adicionarAttr(query, value){
    query[value].setAttribute('required', '')
}
// função que pega os objetos e adiciona ou remove o atributo
function checkBoxStatusRemover(){
    for(let value = 0; value < 5; value++){
        removerAttr(QUERYINPUT, value)
    }
    for(let value = 0; value < 2; value++){
        removerAttr(QUERYSELECT, value)
    }
}
function checkBoxStatusAdicionar(){
    for(let value = 0; value < 5; value++){
        adicionarAttr(QUERYINPUT, value)
    } 
    for(let value = 0; value < 2; value++){
        adicionarAttr(QUERYSELECT, value)
    } 
}

// funcão de inicialização da checagem de verificação
function verificarCheck(){
    let checkbox = document.getElementById('checkbox')
    let checkAttribute = checkbox.getAttribute('valorCheck')
    
    if(checkAttribute == '0'){
       validar(1)
       checkBoxStatusRemover()
    }
    else{
        validar(0)
        checkBoxStatusAdicionar()
    }
}
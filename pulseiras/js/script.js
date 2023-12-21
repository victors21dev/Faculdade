const toastTrigger = document.getElementById('liveToastBtn')
const toastLiveExample = document.getElementById('liveToast')
if (toastTrigger) {
  toastTrigger.addEventListener('click', () => {
    const toast = new bootstrap.Toast(toastLiveExample)

    toast.show()
  })
}
// _________________________
const MENSAGEMLIMPAR = document.getElementById('telaLimpar')
let telaImpressaoEt = document.getElementById('telaImpressao')

function limparFormulario(){
    location.reload();
}
function ocultarMensagemLimpar(){
    MENSAGEMLIMPAR.style.display =  'none'
}
function telaValidacao(){
    MENSAGEMLIMPAR.style.display = 'block'
}

function btnVoltar(){
  telaImpressaoEt.style.display = "none";
  removerLocalStorage()
}
function carregamentoPag(){
  removerLocalStorage()
}
function removerLocalStorage(){
  localStorage.removeItem("valores")
}
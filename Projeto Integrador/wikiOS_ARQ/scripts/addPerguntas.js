// div principal das perguntas
let div = document.querySelector(".div_design")

// Titulos
let perguntasOS = new Object();

perguntas.arq = [
    'A CPU dos computadores tem uma estrutura lógica composta por:',
    'Em um computador, o processamento de dados se dá na seguinte sequência:',
    'Os componentes de memória de um sistema computacional obedecem a uma hierarquia referente a velocidade de acesso e capacidade de armazenamento. As memórias mais próximas ao processador e mais rapidamente acessadas por ele são classificadas de memórias de alto nível, são elas:',
    'Os barramentos são fundamentais para o funcionamento interno do computador e permitem a comunicação dos componentes de hardware. O barramento que possui uma única função definida recebe o nome de:',
    'São exemplos de dispositivos de E/S:'
]
perguntas.os = [
    'Descreve os mecanismos de hardware responsáveis pelos sistemas operacionais da terceira geração (1965–1980):',
    'Selecione a opção que completa corretamente a seguinte afirmação: “Os sistemas operacionais funcionam como intermediadores entre   ________e _________, garantindo o funcionamento do sistema computacional”:',
    'Para que o sistema operacional consiga gerenciar os processos a serem executados é utilizado pelo sistema um descritor de processo, também conhecido:',
    'É um tipo de arquivo para o sistema LINUX:',
    'Uma thread pode ser classificada como:'
]


function addPerguntas(matery) {
    let list = `${perguntas}.${matery}`
    let value = 1;

    list.forEach(element => {
        div.innerHTML += `
        <div class="item_div">
            <h6>${value}. ${element}</h2>
            <div id="arqpergunta${value}" result="null"></div>
        </div>`
        value++
    });
}
namespace PortalTransparencia{
    public class ServidorAtivo : Servidor
    {
        public ServidorAtivo()
        {

        }
        public ServidorAtivo(DateTime periodo,
            double remuneracao,
            double comissao,
            double horasExtras, 
            double contribuicaoPrevidenciaria,
            double totalLiquido)
        {
            Remuneracao = remuneracao;
            Comissao = comissao;
            HorasExtras = horasExtras;
            ContribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
            TotalLiquido = totalLiquido;
        }
        public double CalcularTotalLiquido(
            double remuneracao,
            double comissao,
            double horasExtras, 
            double contribuicaoPrevidenciaria,
            double totalLiquido)
        {
            double total = remuneracao + comissao + horasExtras + contribuicaoPrevidenciaria;
            if (total > tetoRedutor) total = tetoRedutor;
            return total;
        }

        public DateTime Periodo;
        public double Remuneracao;
        public double Comissao;
        public double HorasExtras;
        public double TetoRedutor;
        public double ContribuicaoPrevidenciaria;
        public double TotalLiquido;
    }
}
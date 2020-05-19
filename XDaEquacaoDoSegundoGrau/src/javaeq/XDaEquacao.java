package javaeq;

public class XDaEquacao {
        private int valorDeA;
        private int valorDeB;
        private int valorDeC;

        public XDaEquacao() {
        }

        public XDaEquacao(int a, int b, int c) {
            this.valorDeA = a;
            this.valorDeB = b;
            this.valorDeC = c;
        }

        private int calculaDelta () {
            int delta = (this.valorDeB * this.valorDeB - 4*this.valorDeA*this.valorDeC);
            return delta;
        }

        public void calculaBhaskara(){
            int bhaskaraP = -(this.valorDeB + ((int)Math.sqrt(this.calculaDelta()))) / (2*this.valorDeA);
            int bhaskaraN = -(this.valorDeB - ((int)Math.sqrt(this.calculaDelta()))) / (2*this.valorDeA);

            System.out.println("Delta "+this.calculaDelta());
            if((int)Math.sqrt(this.calculaDelta()) != 0){
                System.out.println("Raiz de Delta: "+(int)Math.sqrt(this.calculaDelta()));
                System.out.println("Bhaskara positivo(X'): "+bhaskaraN);
                System.out.println("Bhaskara negativo(X''): "+bhaskaraP);
                return;
            }

            System.out.println("Para Delta negativo não se tem raizes no campo dos inteiros");

        }

        public int getValorDeA() {
            return this.valorDeA;
        }

        public void setValorDeA(int valorDeA) {
            this.valorDeA = valorDeA;
        }

        public int getValorDeB() {
            return this.valorDeB;
        }

        public void setValorDeB(int valorDeB) {
            this.valorDeB = valorDeB;
        }

        public int getValorDeC() {
            return this.valorDeC;
        }

        public void setValorDeC(int valorDeC) {
            this.valorDeC = valorDeC;
        }
}

package CMatematicas;

public class CMatematicas {

    private float radio;
    private float altura;
    private float num1;
    private float num2;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float AreaCirculo() {
        return 3.14f * radio * radio;
    }

    public float Cilindro() {
        return 3.14f * (radio * radio) * altura;
    }

    public float Menor() {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public float Mayor() {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public float Division() {
        return num1 / num2;
    }
}

class Arvore{
    int key;
    Arvore left = null;
    Arvore right = null;

    public Arvore(int key){
        this.key = key;
    }

    public void Show(Arvore a1){
        System.out.print(" " + a1.key + " ");
        if(a1.left != null) Show(a1.left);
        if(a1.right != null) Show((a1.right));
    }

    public void Add(int key){
        if(key < this.key){
            if(this.left == null){
                this.left = new Arvore(key);
            } else {
                this.left.Add(key);
            }
        }

        if(key > this.key){
            if(this.right == null){
                this.right = new Arvore(key);
            } else {
                this.right.Add(key);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Arvore a = new Arvore(20);
        a.Add(15);
        a.Add(10);
        a.Add(5);
        a.Add(25);
        a.Add(30);
        a.Add(35);
        System.out.print("Teste 3:");
        a.Show(a);
        System.out.println();
    }
}
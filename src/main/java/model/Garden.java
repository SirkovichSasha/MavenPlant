package model;

public class Garden {
    private int n;
    private Plant[] plants;
    private int index;

    public Garden(int n) {
        this.n = n;
        this.plants = new Plant[n];
    }

    public boolean add(Plant p) {             //1
        if ((this.index > n - 1) || (this.index < 0)) return false;
        plants[this.index] = new Plant(p);
        this.index++;
        return true;
    }

    public Plant get(int index) {           //2
        if ((index > n - 1) || (index < 0)) return null;
        return plants[index];
    }

    public int count() {                  //3
        return this.index;
    }

    public String allPlants()            //4
    {
        String allPlants = "";
        for (int i = 0; i < this.index; i++) {
            allPlants += plants[i].toString();
        }
        return allPlants;
    }

    public Plant search(String name) {  //5
        for (int i = 0; i < this.index; i++) {
            if (plants[i].getName().equals(name)) return plants[i];
        }
        return null;
    }

    public int search(Plant p) {     //6
        for (int i = 0; i < this.index; i++) {
            if (plants[i].equals(p))
                return i;
        }
        return -1;
    }

    public Plant delete(String name) {  //7
        Plant p = search(name);
        if (p == null) return null;

        int index = search(p);
        if (index == -1) return null;

        for (int i = index; i < n - 1; i++) {
            plants[i] = plants[i + 1];
            plants[i + 1] = null;
        }
        this.index--;
        return p;
    }

    public boolean delete(Plant p) {  //8
        Plant pForDelete = delete(p.getName());
        return pForDelete != null;
    }

    public boolean insert(int index, Plant p) {  //9
        if ((index > n - 1) || (index < 0)) return false;
        if (index == this.index) return add(p);
        plants[index] = new Plant(p);
        return true;
    }
}

package FranciscoMarmol20240348;

    public class Producto {
        private String id;
        private int stock;

        public Producto(String id, int stock) {
            this.id = id;
            this.stock = stock;
        }

        // Getters y setters
        public String getId() {
            return id;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "[" + id + ", " + stock + "]";
        }
    }


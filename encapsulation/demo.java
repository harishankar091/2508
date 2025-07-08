package encapsulation;

public class demo {
    public class publicinner {
        public void show() {
            System.out.println("public inner class");
        }
    }

    private class privateinner {
        public void show() {
            System.out.println("private inner class");
        }
    }

    protected class protectedinner {
        public void show() {
            System.out.println("protected inner class");
        }
    }
    class defaultinner {
        public void show() {
            System.out.println("default inner class");
        }
    }
}

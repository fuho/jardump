class JarDump {
    public static void main(String[] args) {
          System.out.println("[Command-line arguments - one per line]");
          for (String arg : args) {
                System.out.println(arg);
          }
          System.out.println("[End of Command-line - one per line]");
          System.exit(0);
    }
}

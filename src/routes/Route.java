package routes;

public enum Route {
    SPLASH("/ui/assets/screens/loader.fxml"),MAINPANE("/ui/assets/screens/mainPane.fxml");

    private String route;

    private Route(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
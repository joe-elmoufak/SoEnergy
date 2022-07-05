package utils;

import functions.*;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class PicoDependencyInjector implements ObjectFactory {

    private PicoFactory delegate = new PicoFactory();

    public PicoDependencyInjector() {
        addClass(AddressConfirmation.class);
        addClass(ChromeDriverWrapper.class);
        addClass(Homepage.class);
        addClass(Product.class);
        addClass(Shipping.class);
        addClass(ShoppingBasket.class);
        addClass(SignIn.class);
        addClass(TopMenu.class);
    }

    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }
}
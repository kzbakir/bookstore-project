package kz.epam.bookstore.factory;

import kz.epam.bookstore.action.BaseAction;
import kz.epam.bookstore.action.MainPageAction;
import kz.epam.bookstore.action.LoginAction;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ActionFactory {
    private static final Map<String, BaseAction> actions = new HashMap<>();
    private static ActionFactory actionFactory;

    private ActionFactory() {
    }

    static {
        actions.put("/index", new MainPageAction());
        actions.put("/login", new LoginAction());
    }

    public static ActionFactory getActionFactory() {
        ActionFactory localInstance = actionFactory;
        if (localInstance == null) {
            synchronized (ActionFactory.class) {
                localInstance = actionFactory;
                if (localInstance == null) {
                    actionFactory = localInstance = new ActionFactory();
                }
            }
        }
        return localInstance;
    }

    public BaseAction getAction(HttpServletRequest request) {
        BaseAction baseAction = actions.get(request.getPathInfo());
        if (null != baseAction) {
            return baseAction;
        }
        return null;
    }
}

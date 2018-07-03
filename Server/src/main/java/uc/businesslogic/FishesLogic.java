package uc.businesslogic;

import org.w3c.dom.stylesheets.LinkStyle;
import uc.dataaccess.FishesDAO;
import uc.entities.*;

import java.util.List;

public class FishesLogic extends LogicBase {

    private FishesDAO dao;

    public FishesLogic() {
        dao = new FishesDAO();
    }

    public OperationResult<List<Fishes>> getFishes(ParamFishes paramFishes) {
        OperationResult<List<Fishes>> result = new OperationResult<>();

        try {
            String piid = paramFishes.getPiId();

            if(piid == null || piid.isEmpty())
                result.setResult(dao.getFishes());
            else
                result.setResult(dao.getFishes(piid));

            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }

    public int getMaxTemp(String piid) {
        try{
            return dao.getMaxTemp(piid);
        } catch (Exception ex) {
            return -1;
        }
    }

    public int getMinTemp(String piid) {
        try{
            return dao.getMinTemp(piid);
        } catch (Exception ex) {
            return -1;
        }
    }

    public OperationResult<Fishes> putFishes(Fishes fishes) {
        OperationResult<Fishes> result = new OperationResult<>();

        try {
            // insert to database
            result.setResult(dao.putFishes(fishes));
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }
}

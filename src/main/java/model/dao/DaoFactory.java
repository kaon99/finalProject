package model.dao;

public  abstract  class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract DepartamentDao createDepartamentDao();
    public abstract RatingDao createRatitingDao();
    public  abstract SpecialtyDao createSpecialtyDao ();
    public  abstract  StudentDao createStudentDao();


    public static DaoFactory getInstance(){
        if(daoFactory == null){
            synchronized (DaoFactory.class){
                if(daoFactory ==null){
                    //DaoFactory temp = new JDBCDaoFactory();
                  //  daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }

}

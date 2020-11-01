package edu.mum.cs.cs525.labs.skeleton;

public class ProdAccountDAOFactory implements AccountDAOFactory{
  public ProdAccountDAOFactory() {
    createAccountDAO();
  }

  @Override
  public AccountDAO createAccountDAO() { return new AccountDAOImpl(); }
}

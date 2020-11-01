package edu.mum.cs.cs525.labs.skeleton;

public class MockAccountDAOFactory implements AccountDAOFactory{
  public MockAccountDAOFactory() {
    createAccountDAO();
  }

  @Override
  public AccountDAO createAccountDAO() {
    return new MockAccountDAOImpl();
  }
}

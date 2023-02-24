class VulnerableCode {
    private static void brokenCode() {
        Session session = sessionFactory.openSession();
        Query q = session.createQuery("select t from UserEntity t where id = " + input);
        q.execute();
    }
}

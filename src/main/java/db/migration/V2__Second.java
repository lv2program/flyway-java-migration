package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

public class V2__Second extends BaseJavaMigration {

  @Override
  public void migrate(Context context) throws Exception {
    System.out.println("---");
    System.out.println("Flyway Context Loaded " + context.getConfiguration().getBaselineDescription());
    System.out.println("---");
  }
}

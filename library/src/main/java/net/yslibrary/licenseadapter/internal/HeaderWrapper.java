package net.yslibrary.licenseadapter.internal;

import net.yslibrary.licenseadapter.License;
import net.yslibrary.licenseadapter.LicenseEntry;

/**
 * Created by a12897 on 2016/04/26.
 */
public class HeaderWrapper implements Wrapper {

  private final LicenseEntry entry;
  private boolean expanded;

  public HeaderWrapper(LicenseEntry entry) {
    this.entry = entry;
  }

  public int getItemCount() {
    return expanded ? 2 : 1;
  }

  public void open() {
    this.expanded = true;
  }

  public void close() {
    this.expanded = false;
  }

  public boolean isExpanded() {
    return expanded;
  }

  public boolean hasContent() {
    return entry.hasContent();
  }

  public LicenseEntry entry() {
    return entry;
  }

  public License license() {
    return entry.license();
  }

  @Override
  public ViewType type() {
    return ViewType.HEADER;
  }
}

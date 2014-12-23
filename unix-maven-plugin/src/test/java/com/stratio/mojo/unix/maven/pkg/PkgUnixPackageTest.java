 package com.stratio.mojo.unix.maven.pkg;

import com.stratio.mojo.unix.maven.*;
import com.stratio.mojo.unix.maven.sysvpkg.*;
import org.codehaus.plexus.*;

/**
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 */
public class PkgUnixPackageTest
    extends PlexusTestCase
{
    public void testFiltering()
        throws Exception
    {
        SysvPkgPackagingFormat packagingFormat = new SysvPkgPackagingFormat();

        new UnixPackageTestUtil<PkgUnixPackage, PkgUnixPackage.PkgPreparedPackage>( "pkg", packagingFormat ).testFiltering();
    }
}

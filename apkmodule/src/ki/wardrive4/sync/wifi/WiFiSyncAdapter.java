/*
 *   wardrive4 - android wardriving application (remake for the ICS)
 *   Copyright (C) 2012 Raffaele Ragni
 *   https://github.com/raffaeleragni/android-wardrive4
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ki.wardrive4.sync.wifi;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/**
 * Remotely synchronizes the WiFi resource.
 *
 * @author Raffaele Ragni <raffaele.ragni@gmail.com>
 */
public class WiFiSyncAdapter extends AbstractThreadedSyncAdapter
{
    private final AccountManager mAccountManager;

    private final Context mContext;

    public WiFiSyncAdapter(Context context, boolean autoInitialize)
    {
        super(context, autoInitialize);
        mContext = context;
        mAccountManager = AccountManager.get(context);
    }

    @Override
    public void onPerformSync(Account acnt, Bundle bundle, String string, ContentProviderClient cpc, SyncResult sr)
    {
        // TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
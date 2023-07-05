package uz.gita.playmarketbookapp.data.local.room.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import uz.gita.playmarketbookapp.data.local.room.entity.BookEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BookEntity> __insertionAdapterOfBookEntity;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookEntity = new EntityInsertionAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `books` (`id`,`name`,`bookUrl`,`coverUrl`,`owner`,`description`,`reference`,`onlineBookUrl`,`save`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getBookUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBookUrl());
        }
        if (value.getCoverUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCoverUrl());
        }
        if (value.getOwner() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOwner());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getReference() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getReference());
        }
        if (value.getOnlineBookUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOnlineBookUrl());
        }
        final int _tmp = value.getSave() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
  }

  @Override
  public void addBook(final BookEntity book) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookEntity.insert(book);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<BookEntity>> getAllSaveBook() {
    final String _sql = "SELECT * FROM books";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"books"}, new Callable<List<BookEntity>>() {
      @Override
      public List<BookEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfBookUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "bookUrl");
          final int _cursorIndexOfCoverUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverUrl");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfReference = CursorUtil.getColumnIndexOrThrow(_cursor, "reference");
          final int _cursorIndexOfOnlineBookUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "onlineBookUrl");
          final int _cursorIndexOfSave = CursorUtil.getColumnIndexOrThrow(_cursor, "save");
          final List<BookEntity> _result = new ArrayList<BookEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BookEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpBookUrl;
            if (_cursor.isNull(_cursorIndexOfBookUrl)) {
              _tmpBookUrl = null;
            } else {
              _tmpBookUrl = _cursor.getString(_cursorIndexOfBookUrl);
            }
            final String _tmpCoverUrl;
            if (_cursor.isNull(_cursorIndexOfCoverUrl)) {
              _tmpCoverUrl = null;
            } else {
              _tmpCoverUrl = _cursor.getString(_cursorIndexOfCoverUrl);
            }
            final String _tmpOwner;
            if (_cursor.isNull(_cursorIndexOfOwner)) {
              _tmpOwner = null;
            } else {
              _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpReference;
            if (_cursor.isNull(_cursorIndexOfReference)) {
              _tmpReference = null;
            } else {
              _tmpReference = _cursor.getString(_cursorIndexOfReference);
            }
            final String _tmpOnlineBookUrl;
            if (_cursor.isNull(_cursorIndexOfOnlineBookUrl)) {
              _tmpOnlineBookUrl = null;
            } else {
              _tmpOnlineBookUrl = _cursor.getString(_cursorIndexOfOnlineBookUrl);
            }
            final boolean _tmpSave;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfSave);
            _tmpSave = _tmp != 0;
            _item = new BookEntity(_tmpId,_tmpName,_tmpBookUrl,_tmpCoverUrl,_tmpOwner,_tmpDescription,_tmpReference,_tmpOnlineBookUrl,_tmpSave);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<BookEntity> getBooks(final String name) {
    final String _sql = "SELECT * FROM books WHERE name LIKE ? || '%'  ORDER BY UPPER(name) ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfBookUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "bookUrl");
      final int _cursorIndexOfCoverUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "coverUrl");
      final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfReference = CursorUtil.getColumnIndexOrThrow(_cursor, "reference");
      final int _cursorIndexOfOnlineBookUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "onlineBookUrl");
      final int _cursorIndexOfSave = CursorUtil.getColumnIndexOrThrow(_cursor, "save");
      final List<BookEntity> _result = new ArrayList<BookEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BookEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpBookUrl;
        if (_cursor.isNull(_cursorIndexOfBookUrl)) {
          _tmpBookUrl = null;
        } else {
          _tmpBookUrl = _cursor.getString(_cursorIndexOfBookUrl);
        }
        final String _tmpCoverUrl;
        if (_cursor.isNull(_cursorIndexOfCoverUrl)) {
          _tmpCoverUrl = null;
        } else {
          _tmpCoverUrl = _cursor.getString(_cursorIndexOfCoverUrl);
        }
        final String _tmpOwner;
        if (_cursor.isNull(_cursorIndexOfOwner)) {
          _tmpOwner = null;
        } else {
          _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpReference;
        if (_cursor.isNull(_cursorIndexOfReference)) {
          _tmpReference = null;
        } else {
          _tmpReference = _cursor.getString(_cursorIndexOfReference);
        }
        final String _tmpOnlineBookUrl;
        if (_cursor.isNull(_cursorIndexOfOnlineBookUrl)) {
          _tmpOnlineBookUrl = null;
        } else {
          _tmpOnlineBookUrl = _cursor.getString(_cursorIndexOfOnlineBookUrl);
        }
        final boolean _tmpSave;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSave);
        _tmpSave = _tmp != 0;
        _item = new BookEntity(_tmpId,_tmpName,_tmpBookUrl,_tmpCoverUrl,_tmpOwner,_tmpDescription,_tmpReference,_tmpOnlineBookUrl,_tmpSave);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

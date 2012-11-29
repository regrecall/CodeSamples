mkdir a_test_dir
echo testing ... testing > a_test_dir/tt
if tar cz a_test_dir > archived.tgz; then
    echo Compression wnet OL. Removing dircetory.
    rm -r a_test_dir
else
    echo Compression failed. Doing nothing.
fi

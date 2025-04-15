public class dataHewan {
    hewan[] datahewan = new hewan[100];
    int idx = 0;

    // Tambah hewan ke array
    public void tambah(hewan hwn) {
        if (idx < datahewan.length) {
            datahewan[idx++] = hwn;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Tampilkan semua hewan
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            datahewan[i].tampil();
        }
    }

    // Sorting berdasarkan umur (Ascending)
    void sortingASC() {
        for (int i = 0; i < idx; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (datahewan[j - 1].umur > datahewan[j].umur) {
                    hewan temp = datahewan[j];
                    datahewan[j] = datahewan[j - 1];
                    datahewan[j - 1] = temp;
                }
            }
        }
    }

    // Sorting berdasarkan umur (Descending)
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (datahewan[j].umur > datahewan[maxIdx].umur) {
                    maxIdx = j;
                }
            }
            hewan temp = datahewan[i];
            datahewan[i] = datahewan[maxIdx];
            datahewan[maxIdx] = temp;
        }
    }

    // Pencarian berdasarkan ID (Sequential Search)
    public void pencarianDataSequential(String id) {
        hewan[] hasil = new hewan[idx];
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (datahewan[i] != null && datahewan[i].id.equalsIgnoreCase(id)) {
                hasil[count++] = datahewan[i];
            }
        }

        if (count > 0) {
            System.out.println("Hewan ditemukan:");
            for (int i = 0; i < count; i++) {
                hasil[i].tampil();
            }
            if (count > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu hasil!");
            }
        } else {
            System.out.println("Hewan tidak ditemukan.");
        }
    }

    // Pencarian berdasarkan umur (Binary Search)
    public void pencarianDataBinary(int umur) {
        sortingASC();

        int left = 0, right = idx - 1, mid;
        hewan[] hasil = new hewan[idx];
        int count = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (datahewan[mid].umur == umur) {
                // cari ke kiri
                int temp = mid;
                while (temp >= 0 && datahewan[temp].umur == umur) {
                    hasil[count++] = datahewan[temp--];
                }
                // cari ke kanan
                temp = mid + 1;
                while (temp < idx && datahewan[temp].umur == umur) {
                    hasil[count++] = datahewan[temp++];
                }
                break;
            } else if (datahewan[mid].umur < umur) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (count > 0) {
            System.out.println("Hewan ditemukan:");
            for (int i = 0; i < count; i++) {
                hasil[i].tampil();
            }
            if (count > 1) {
                System.out.println("Ditemukan lebih dari satu hasil!");
            }
        } else {
            System.out.println("Hewan tidak ditemukan.");
        }
    }
}

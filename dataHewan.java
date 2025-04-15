public class dataHewan {
    hewan[] dataHewan = new hewan[100];
    int idx = 0;

    public void tambah(hewan hwn) {
        if (idx < dataHewan.length) {
            dataHewan[idx++] = hwn;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data hewan.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataHewan[i].tampil();
            }
        }
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataHewan[j].umur > dataHewan[maxIdx].umur) {
                    maxIdx = j;
                }
            }
            hewan temp = dataHewan[i];
            dataHewan[i] = dataHewan[maxIdx];
            dataHewan[maxIdx] = temp;
        }
        System.out.println("Data berhasil diurutkan berdasarkan umur (desc).");
    }

    public void pencarianDataSequential(String id) {
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (dataHewan[i] != null && dataHewan[i].id.equalsIgnoreCase(id)) {
                System.out.println("hewan ditemukan:");
                dataHewan[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("hewan tidak ditemukan.");
        }
    }

    public void pencarianDataBinary(int umur) {
        sortingDSC();
        int left = 0, right = idx - 1;

        boolean ditemukan = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataHewan[mid].umur == umur) {
                // Tampilkan semua hewan dengan umur yang sama
                int temp = mid;
                while (temp >= 0 && dataHewan[temp].umur == umur) {
                    dataHewan[temp].tampil();
                    temp--;
                }
                temp = mid + 1;
                while (temp < idx && dataHewan[temp].umur == umur) {
                    dataHewan[temp].tampil();
                    temp++;
                }
                ditemukan = true;
                break;
            } else if (dataHewan[mid].umur < umur) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("hewan tidak ditemukan.");
        }
    }
}

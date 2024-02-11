class Human:
    def __init__(self, id, nama, bidang, partai):
        self.id = id
        self.nama = nama
        self.bidang = bidang
        self.partai = partai
    
    def setId(self, id):
        self.id = id

    def getId(self):
        return self.id
    
    def setNama(self, nama):
        self.nama = nama

    def getNama(self):
        return self.nama
    
    def setBidang(self, bidang):
        self.bidang = bidang

    def getBidang(self):
        return self.bidang
    
    def setPartai(self, partai):
        self.partai = partai

    def getPartai(self):
        return self.partai
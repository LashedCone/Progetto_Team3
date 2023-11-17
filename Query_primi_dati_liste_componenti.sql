INSERT INTO cpu (manufacturer, boost_clock, core_clock, core_count, integrated_graphics, max_memory, part, series, socket, tdpw)
VALUES 
('Intel', '5.3 GHz', '3.5 GHz', 8, 'No', '128 GB', '11900K', 'Core i9', 'LGA 1200', 125),
('Intel', '5.0 GHz', '3.6 GHz', 12, 'Yes', '128 GB', '12700K', 'Core i7', 'LGA 1700', 125),
('Intel', '4.9 GHz', '3.9 GHz', 6, 'Yes', '64 GB', '11600K', 'Core i5', 'LGA 1200', 125),
('AMD', '4.8 GHz', '3.7 GHz', 12, 'No', '128 GB', '5900X', 'Ryzen 9', 'AM4', 105),
('AMD', '4.7 GHz', '3.8 GHz', 8, 'No', '128 GB', '5800X', 'Ryzen 7', 'AM4', 105),
('AMD', '4.7 GHz', '3.8 GHz', 8, 'No', '128 GB', '5600X', 'Ryzen 5', 'AM4', 65),
('AMD', '5.7 GHz', '4.5 GHz', 16, 'Yes', '128 GB', '7950X', 'Ryzen 9', 'AM5', 170);

INSERT INTO computer_case (manufacturer, model_Name, type, color, front_PanelUSB, motherboard_Form_Factor, maximum_Video_Card_Length, internal35Drive_Bays, internal25Drive_Bays, expansion_Slots, radiator_Support)
VALUES
('Lian Li', 'PC-O11DEX', 'ATX Mid Tower', 'Black', 'USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A', 'ATX, EATX, Micro ATX, Mini ITX', '422 mm / 16.614', 6, 3, 8, '360mm × 1 or 280mm × 1'),
('NZXT', 'H510i', 'ATX Mid Tower', 'Black', 'USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A', 'ATX, Micro ATX, Mini ITX', '381 mm / 15.0', 2, 2, 7, '280mm × 1 or 240mm × 1'),
('Fractal Design', 'Meshify C', 'ATX Mid Tower', 'Black', 'USB 3.2 Gen 2 Type-C, USB 3.2 Gen 1 Type-A', 'ATX, Micro ATX, Mini ITX', '315 mm / 12.4', 2, 3, 7, '360mm × 1 or 280mm × 1'),
('Cooler Master', 'MasterBox Q300L', 'Micro ATX Mini Tower', 'Black', 'USB 3.0 × 2', 'Micro ATX, Mini ITX', '360 mm / 14.17', 1, 2, 4, '120mm × 2'),
('Phanteks', 'Enthoo Pro M', 'ATX Mid Tower', 'Black', 'USB 3.1 Gen 2 Type-C, USB 3.0 × 2', 'ATX, Micro ATX, Mini ITX', '406 mm / 16.0', 2, 2, 7, '360mm × 1 or 280mm × 1'),
('NZXT', 'H7i10', 'ATX Mid Tower', 'White', 'USB 3.1 Gen 2 Type-C, USB 3.1 Gen 1 Type-A', 'ATX, EATX, Micro ATX, Mini ITX', '413 mm / 16.3', 7, 2, 7, '360mm × 1 or 280mm × 1'),
('Fractal Design', 'Define R6', 'ATX Mid Tower', 'Black', 'USB 3.1 Gen 2 Type-C, USB 3.1 Gen 1 Type-A', 'ATX, EATX, Micro ATX, Mini ITX', '440 mm / 17.3', 6, 2, 7, '360mm × 1 or 280mm × 1'),
('Corsair', 'Crystal Series 680X', 'ATX Mid Tower', 'Black', 'USB 3.1 Gen 2 Type-C, USB 3.0 × 2', 'ATX, EATX, Micro ATX, Mini ITX', '330 mm / 13.0', 3, 2, 8, '360mm × 2 or 280mm × 2');
-- Inserimento dei dati dei dissipatori CPU nella tabella "CpuCoolers"
INSERT INTO cpu_Cooler (manufacturer, model, part_Id, minRPM, maxRPM, noise_Min, noise_Max, cpu_Socket, is_Water_Cooled)
VALUES
('CoolerMaster', 'Hyper 212 RGB', 'CM-HYPER212RGB', 600, 2000, 10, 30, 'LGA 1200, AM4', false),
('Noctua', 'NH-D15', 'NOCT-NHD15', 300, 1500, 15, 25, 'LGA 1151, AM4', false),
('Corsair', 'iCUE H150i', 'COR-H150i', 800, 2400, 20, 40, 'LGA 1200, AM4', true),
('Be Quiet!', 'Dark Rock Pro 4', 'BK022', 600, 1500, 12, 24, 'LGA 1200, AM4', false),
('Corsair', 'H115i RGB Platinum', 'CW-9060038-WW', 400, 2400, 18, 35, 'LGA 1200, AM4', true),
('CoolerMaster', 'Hyper 212 RGB', 'RR-212S-20PC-R1', 650, 2000, 8, 30, 'LGA 1151, AM4', false),
('NZXT', 'Kraken X63', 'RL-KRX63-01', 500, 1800, 22, 36, 'LGA 1200, AM4', true),
('Deepcool', 'Gammaxx GT BK', 'DP-MCH4-GMX-GT-BK', 500, 1500, 30, 35, 'LGA 1151, AM4', FALSE);
-- Inserimento dei dati delle schede grafiche nella tabella "Gpus"
INSERT INTO gpu (manufacturer, part_Number, chipset, memory_SizeGB, memory_Type, core_ClockMHz, boost_ClockMHz, effective_Memory_ClockMHz, interface_Type, lengthMM, tdp_Watt)
VALUES
('SuperGraphics', 'SGX4080TI16GB', 'GeForce RTX 4080 Ti', 16, 'GDDR6X', 2300, 2600, 22600, 'PCIe x16', 335, 340),
('TechVision', 'TVGTX4080ULTRA', 'GeForce RTX 4080', 16, 'GDDR6X', 2250, 2550, 22500, 'PCIe x16', 330, 330),
('ExtremeForce', 'EFX4080PRO16G', 'GeForce RTX 4080', 16, 'GDDR6X', 2205, 2505, 22400, 'PCIe x16', 332, 320),
('PNY', 'VCG408016TFXPB1', 'GeForce RTX 4080', 16, 'GDDR6X', 2205, 2505, 22400, 'PCIe x16', 332, 320),
('AMD', 'RX8700XT16GB', 'Radeon RX 8700 XT', 16, 'GDDR6', 2100, 2500, 19200, 'PCIe x16', 310, 290),
('ASUS', 'ROG407016G', 'GeForce RTX 4070', 16, 'GDDR6X', 2150, 2550, 22000, 'PCIe x16', 328, 310),
('MSI', 'MSIRX680016G', 'Radeon RX 6800', 16, 'GDDR6', 2100, 2500, 19200, 'PCIe x16', 312, 300),
('EVGA', 'EVGAGTX408016G', 'GeForce GTX 4080', 16, 'GDDR6X', 2250, 2550, 22500, 'PCIe x16', 335, 330),
('Sapphire', 'SAPRX6700XT16G', 'Radeon RX 6700 XT', 16, 'GDDR6', 2000, 2400, 19200, 'PCIe x16', 315, 250);
INSERT INTO Motherboard (manufacturer, part, socket, form_Factor, chipset, memory_Capacity, memory_Type, memory_Slots, memory_Speed, pcieX16Slots, pcieX8Slots, pcieX4Slots, pcieX1Slots, pci_Slots, m2Slots, sata_Ports, onboard_Ethernet, wireless_Networking)
VALUES
('ASUS', 'ROG Strix B550-F', 'AM4', 'ATX', 'B550', 128, 'DDR4', 4, '3200 MHz', 2, 1, 1, 2, 3, '2 x M.2', 6, '2.5 Gigabit Ethernet', 'Wi-Fi 6'),
('GIGABYTE', 'Aorus X570 Elite', 'AM4', 'ATX', 'X570', 128, 'DDR4', 4, '3200 MHz', 2, 2, 1, 2, 3, '2 x M.2', 6, '2.5 Gigabit Ethernet', 'Wi-Fi 6'),
('MSI', 'B450 TOMAHAWK', 'AM4', 'ATX', 'B450', 64, 'DDR4', 4, '3466 MHz', 1, 1, 1, 2, 2, '1 x M.2', 6, '1 Gigabit Ethernet', 'None'),
('MSI', 'X670E TOMAHAWK', 'AM5', 'ATX', 'X670', 128, 'DDR5', 4, '6000 MHz', 2, 2, 3, 2, 2, '2 x M.2', 8, '2.5 Gigabit Ethernet', 'Wi-Fi 6'),
('ASRock', 'B550 Steel Legend', 'AM4', 'ATX', 'B550', 128, 'DDR4', 4, '3200 MHz', 2, 2, 2, 2, 2, '2 x M.2', 6, '1 Gigabit Ethernet', 'None'),
('ASUS', 'ROG Strix X570-E', 'AM4', 'ATX', 'X570', 128, 'DDR4', 4, '3600 MHz', 3, 2, 1, 2, 3, '2 x M.2', 8, '2.5 Gigabit Ethernet', 'Wi-Fi 6'),
('GIGABYTE', 'B450 Aorus Pro', 'AM4', 'ATX', 'B450', 64, 'DDR4', 4, '3200 MHz', 1, 1, 1, 2, 2, '1 x M.2', 6, '1 Gigabit Ethernet', 'None'),
('MSI', 'MAG B550 Mortar', 'AM4', 'Micro-ATX', 'B550', 128, 'DDR4', 4, '3466 MHz', 1, 1, 2, 2, 2, '1 x M.2', 4, '1 Gigabit Ethernet', 'None'),
('ASRock', 'X570 Taichi', 'AM4', 'ATX', 'X570', 128, 'DDR4', 4, '3600 MHz', 2, 3, 1, 3, 3, '3 x M.2', 10, '2.5 Gigabit Ethernet', 'Wi-Fi 6'),
('GIGABYTE', 'B460M DS3H', 'LGA 1200', 'Micro-ATX', 'B460', 64, 'DDR4', 4, '2933 MHz', 1, 1, 1, 1, 2, '1 x M.2', 6, '1 Gigabit Ethernet', 'None');
INSERT INTO Power_Supply (manufacturer, model, part, type, efficiency_Rating, wattage, modular, color, atx4Pin_Connectors, eps8Pin_Connectors, pcie12_4, pcie12, pcie8, pcie6_2, pcie6, sata, molex4)
VALUES
('MSI', 'A1000G PCIE5', 'MPG A1000G PCIE 5', 'ATX', '80+ Gold', 1000, true, 'Black', 0, 2, 1, 0, 0, 6, 0, 12, 4),
('Corsair', 'RM850x', 'CP-9020180-NA', 'ATX', '80+ Gold', 850, true, 'Black', 0, 1, 2, 0, 0, 4, 0, 10, 0),
('EVGA', 'SuperNOVA 750 G5', '220-G5-0750-X1', 'ATX', '80+ Gold', 750, true, 'Black', 0, 1, 2, 0, 0, 4, 0, 9, 0);
-- Inserimento dei dati delle memorie RAM nella tabella "RAM"
INSERT INTO RAM (serial_Part, ddr_Speed, ddr_Gen, form_Factor, module_Count, capacity_Gb, cas_Latency, voltage, timing)
VALUES
('Corsair Vengeance LPX', '3200', 'DDR4', 'DIMM', 2, 16, 16, 1.35, '16-18-18-36'),
('G.Skill Ripjaws V', '3600', 'DDR4', 'DIMM', 2, 32, 18, 1.4, '18-22-22-42'),
('Crucial Ballistix', '4000', 'DDR4', 'DIMM', 2, 64, 19, 1.35, '19-23-23-45'),
('Kingston HyperX Fury', '3200', 'DDR4', 'DIMM', 2, 16, 16, 1.35, '16-18-18-36'),
('Corsair Vengeance RGB Pro', '3600', 'DDR4', 'DIMM', 2, 32, 18, 1.35, '18-22-22-42'),
('Crucial Ballistix Max', '4000', 'DDR4', 'DIMM', 2, 64, 19, 1.35, '19-23-23-45'),
('G.Skill Trident Z', '3200', 'DDR4', 'DIMM', 2, 16, 16, 1.35, '16-18-18-36'),
('HyperX Fury', '3600', 'DDR4', 'DIMM', 2, 32, 18, 1.35, '18-22-22-42'),
('Corsair Vengeance LPX', '4000', 'DDR4', 'DIMM', 2, 64, 19, 1.35, '19-23-23-45');
-- Inserimento dei dati degli storage nella tabella "Storage"
INSERT INTO Storage (manufacturer, model, serial, capacity, type, form_Factor, interface_Connector, is_Nvme)
VALUES
('Samsung', '870 Evo 1TB', 'MZ-77E1T0BW', 1000, 'SSD', '2.5', 'SATA', false),
('Western Digital', 'Black SN770 2TB', 'WDS200T3X0E', 2000, 'SSD', 'M.2-2280', 'M.2 PCIe 4.0 X4', true),
('Crucial', 'MX500 1TB', 'CT1000MX500SSD1', 1000, 'SSD', '2.5', 'SATA', false),
('Western Digital', 'Black SN850X 1TB', 'WDS100T2X0E', 1000, 'SSD', 'M.2-2280', 'M.2 PCIe 4.0 X4', true),
('Samsung', '990 Pro 1TB', 'MZ-V9P1T0BW', 1000, 'SSD', 'M.2-2280', 'M.2 PCIe 4.0 X4', true),
('Kingston', 'A2000', 'SA2000M8/1000G', 1000, 'SSD', 'M.2-2280', 'M.2 PCIe 3.0 X4', true),
('Samsung', '970 Evo Plus 500GB', 'MZ-V7S500BW', 500, 'SSD', 'M.2-2280', 'M.2 PCIe 3.0 X4', true),
('Seagate', 'BarraCuda 4TB', 'ST4000DM004', 4000, 'HDD', '3.5', 'SATA', false),
('SanDisk', 'Extreme Pro 2TB', 'SDSSDXPM2-2T00-G25', 2000, 'SSD', 'M.2-2280', 'M.2 PCIe 3.0 X4', true),
('Western Digital', 'Red Pro 10TB', 'WD101KFBX', 10000, 'HDD', '3.5', 'SATA', false);